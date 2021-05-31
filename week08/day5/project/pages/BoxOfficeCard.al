page 50105 BoxOfficeCard
{
    PageType = Card;
    ApplicationArea = All;
    UsageCategory = Administration;
    SourceTable = BoxOffice;
    DelayedInsert = true;
    AutoSplitKey = true;
    Caption = 'Box office Card';

    layout
    {
        area(Content)
        {
            group(GroupName)
            {
                field(Rating; Rec.Rating)
                {
                    ApplicationArea = All;

                }

                field(DomesticSales; Rec.DomesticSales)
                {
                    ApplicationArea = All;

                }

                field(InternationalSales; Rec.InternationalSales)
                {
                    ApplicationArea = All;

                }

                field(MovieId; Rec.MovieId)
                {
                    ApplicationArea = All;

                }

            }
        }
    }


}