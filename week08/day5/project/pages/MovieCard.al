page 50103 MovieCard
{
    PageType = Card;
    ApplicationArea = All;
    UsageCategory = Administration;
    SourceTable = Movie;
    DelayedInsert = true;
    AutoSplitKey = true;
    Caption = 'Movie Card';

    layout
    {
        area(Content)
        {
            group(GroupName)
            {
                field(Title; Rec.Title)
                {
                    ApplicationArea = All;
                    ShowMandatory = true;

                }

                field(Year; Rec.Year)
                {
                    ApplicationArea = All;

                }

                field(LengthInMinute; Rec.LengthInMinute)
                {
                    ApplicationArea = All;

                }

                field(Director; Rec.DirectorId)
                {
                    ApplicationArea = All;

                }


            }
        }
    }

}