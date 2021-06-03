page 50106 ExamResultList
{
    PageType = Card;
    ApplicationArea = All;
    UsageCategory = Administration;
    SourceTable = ExamResult;
    CardPageId = ExamResultCard;

    layout
    {
        area(Content)
        {
            repeater(GroupName)
            {
                field(Id; Rec.Id)
                {
                    ApplicationArea = All;

                }

                field(StudentId; Rec.StudentId)
                {
                    ApplicationArea = All;

                }

                field(StudentScore; Rec.StudentScore)
                {
                    ApplicationArea = All;

                }

                field(ExamId; Rec.ExamId)
                {
                    ApplicationArea = All;

                }
                field(Attended; Rec.Attended)
                {
                    ApplicationArea = All;
                }
            }
        }
    }

}