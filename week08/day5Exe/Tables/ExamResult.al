table 50103 ExamResult
{
    DataClassification = ToBeClassified;

    fields
    {
        field(1; Id; Integer)
        {
            DataClassification = ToBeClassified;

        }

        field(2; StudentId; Integer)
        {
            DataClassification = ToBeClassified;
            TableRelation = Student.Id;

        }

        field(3; StudentScore; Integer)
        {
            DataClassification = ToBeClassified;
            trigger OnValidate()
            begin
                if Rec.StudentScore > MaxExamScore then begin
                    Error('Never ever');
                end;
            end;

        }

        field(4; MaxExamScore; Integer)
        {
            FieldClass = FlowField;
            CalcFormula = lookup(Exam.MaxScore where(Id = field(ExamId)));

        }

        field(5; ExamId; Integer)
        {
            DataClassification = ToBeClassified;
            TableRelation = Exam.Id;

        }

        field(6; Attended; Boolean)
        {
            DataClassification = ToBeClassified;
            TableRelation = Student.Id;

        }

        field(7; ExamDate; Date)
        {
            FieldClass = FlowField;
            CalcFormula = lookup(Exam.DueDate where(Id = field(ExamId)));

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
        Validate(Rec.StudentScore);
    end;

    trigger OnModify()
    begin
        Validate(Rec.StudentScore);
    end;

    trigger OnDelete()
    begin

    end;

    trigger OnRename()
    begin

    end;

}