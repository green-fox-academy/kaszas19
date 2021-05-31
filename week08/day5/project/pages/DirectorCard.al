page 50101 DirectorCard
{
    PageType = Card;
    ApplicationArea = All;
    UsageCategory = Administration;
    SourceTable = Director;
    DelayedInsert = true;
    AutoSplitKey = true;

    layout
    {
        area(Content)
        {
            group(GroupName)
            {
                field(Name; Rec.Name)
                {
                    ApplicationArea = All;
                    Caption = 'Director Name';

                }

                field(Birth; Rec.Birth)
                {
                    ApplicationArea = All;
                    Caption = 'Director date of birth';

                }

            }
        }
    }

}