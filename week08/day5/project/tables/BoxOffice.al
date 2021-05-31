table 50102 BoxOffice
{
    DataClassification = ToBeClassified;
    Caption = 'Box Office';

    fields
    {
        field(1; Id; Integer)
        {
            DataClassification = ToBeClassified;

        }

        field(2; Rating; Decimal)
        {
            DataClassification = ToBeClassified;

        }

        field(3; DomesticSales; Integer)
        {
            DataClassification = ToBeClassified;

            trigger OnValidate();
            begin
                if Rec.DomesticSales < 0 then begin
                    Error('Can not be a negativ number.');
                end;
            end;

        }

        field(4; InternationalSales; Integer)
        {
            DataClassification = ToBeClassified;

            trigger OnValidate();
            begin
                if Rec.InternationalSales <= 0 then begin
                    Error('Can not be a negativ number.');
                end;
            end;
        }

        field(5; MovieId; Integer)
        {
            DataClassification = ToBeClassified;
            TableRelation = Movie.Id;

        }

        field(6; MovieTitle; Text[120])
        {
            FieldClass = FlowField;
            CalcFormula = lookup(Movie.Title where(Id = field(MovieId)));

        }

        field(7; DirectorId; Integer)
        {
            FieldClass = FlowField;
            CalcFormula = lookup(Movie.DirectorId where(Id = field(MovieId)));

        }

    }

    keys
    {
        key(PK; Id)
        {
            Clustered = true;
        }
    }


    trigger OnInsert()
    begin
        Validate(Rec.DomesticSales);
        Validate(Rec.InternationalSales);
    end;

    trigger OnModify()
    begin
        Validate(Rec.DomesticSales);
        Validate(Rec.InternationalSales);
    end;

    trigger OnDelete()
    begin

    end;

    trigger OnRename()
    begin

    end;

}