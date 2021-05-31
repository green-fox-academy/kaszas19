table 50100 Director
{
    DataClassification = ToBeClassified;

    fields
    {
        field(1; Id; Integer)
        {
            DataClassification = ToBeClassified;

        }

        field(2; Name; Text[120])
        {
            DataClassification = ToBeClassified;

            trigger OnValidate();
            begin
                if StrLen(Rec.Name) < 3 then begin
                    Error('The name minimum 3 characters');

                end;
            end;

        }

        field(3; Birth; Date)
        {
            DataClassification = ToBeClassified;

        }

        field(4; DomesticSalesIncome; Decimal)
        {
            FieldClass = FlowField;
            CalcFormula = sum(BoxOffice.DomesticSales where(DirectorId = field(Id)));

        }

        field(5; AvrageRating; Decimal)
        {
            FieldClass = FlowField;
            CalcFormula = average(BoxOffice.Rating where(DirectorId = field(Id)));
        }

        field(6; TotalMovies; Integer)
        {
            FieldClass = FlowField;
            CalcFormula = count(Movie where(DirectorId = field(Id)));
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
        fieldgroup(DropDown; Id, Name) { }
    }


    trigger OnInsert()
    begin
        Validate(Rec.Name);
    end;

    trigger OnModify()
    begin
        Validate(Rec.Name);
    end;

    trigger OnDelete()
    begin

    end;

    trigger OnRename()
    begin

    end;

}