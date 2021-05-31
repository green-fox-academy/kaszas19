table 50101 Movie
{
    DataClassification = ToBeClassified;

    fields
    {
        field(1; Id; Integer)
        {
            DataClassification = ToBeClassified;

        }

        field(2; Title; Text[100])
        {
            DataClassification = ToBeClassified;

        }

        field(3; Year; Integer)
        {
            DataClassification = ToBeClassified;

            trigger OnValidate();
            begin
                if Rec.Year <= 1900 then begin
                    Error('The releasd year have to be greter than 1900.');
                end
                else
                    if Rec.Year > Date2DMY(CalcDate('CY'), 3) then begin
                        Error('Years is incorrect');
                    end;
            end;

        }

        field(4; LengthInMinute; Decimal)
        {
            DataClassification = ToBeClassified;

            trigger OnValidate();
            begin
                if Rec.LengthInMinute < 60 then begin
                    Error('Is not a Movie.');
                end;
            end;
        }

        field(5; DirectorId; Integer)
        {
            DataClassification = ToBeClassified;
            TableRelation = Director.Id;

        }

        field(6; DirectorName; Text[120])
        {
            FieldClass = FlowField;
            CalcFormula = lookup(Director.Name where(Id = field(DirectorId)));

        }

    }

    keys
    {
        key(PK; Id)
        {
            Clustered = true;
        }
    }

    fieldgroups
    {
        fieldgroup(DropDown; Id, Title) { }
    }

    trigger OnInsert()
    begin
        Validate(Rec.Year);
        Validate(Rec.LengthInMinute);
    end;

    trigger OnModify()
    begin
        Validate(Rec.Year);
        Validate(Rec.LengthInMinute);
    end;

    trigger OnDelete()
    begin

    end;

    trigger OnRename()
    begin

    end;

}