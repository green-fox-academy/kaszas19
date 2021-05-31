table 50100 Book
{
    DataClassification = ToBeClassified;
    DataCaptionFields = Id, Title, Author, PageCount;

    fields
    {
        field(1; Id; Integer)
        {
            DataClassification = ToBeClassified;

        }

        field(2; Title; Text[120])
        {
            DataClassification = ToBeClassified;

        }

        field(3; Author; Text[100])
        {
            DataClassification = ToBeClassified;

        }

        field(4; HardCover; Boolean)
        {
            DataClassification = ToBeClassified;

        }

        field(5; PageCount; Integer)
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

    end;

    trigger OnModify()
    begin

    end;

    trigger OnDelete()
    begin

    end;

    trigger OnRename()
    begin

    end;

}