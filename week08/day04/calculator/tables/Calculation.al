table 50100 Calculation
{
    DataClassification = ToBeClassified;

    fields
    {
        field(1; Id; Integer)
        {
            DataClassification = ToBeClassified;

        }

        field(2; FirstNumber; Integer)
        {
            DataClassification = ToBeClassified;

        }

        field(3; SecondNumber; Integer)
        {
            DataClassification = ToBeClassified;

        }

        field(4; Result; Integer)
        {
            DataClassification = ToBeClassified;

        }

        field(5; Operators; Enum Operator)
        {
            DataClassification = ToBeClassified;

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
        case Operators of
            Operators::"+":
                Rec.Result := FirstNumber + SecondNumber;

            Operators::"-":
                Rec.Result := FirstNumber - SecondNumber;

            Operators::"*":
                Rec.Result := FirstNumber - SecondNumber;

            Operators::"/":
                if SecondNumber <> 0 then begin
                    Rec.Result := FirstNumber / SecondNumber;
                end else begin
                    Error('Can not divided by 0');
                end;
        end;
    end;

    trigger OnModify()
    begin
        Rec.Result := FirstNumber + SecondNumber;
    end;

    trigger OnDelete()
    begin

    end;

    trigger OnRename()
    begin

    end;

}