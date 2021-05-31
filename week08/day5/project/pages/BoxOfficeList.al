page 50104 BoxOfficeList
{
    PageType = List;
    ApplicationArea = All;
    UsageCategory = Administration;
    SourceTable = BoxOffice;
    CardPageId = BoxOfficeCard;
    Caption = 'Box office List';

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
                field(MovieTitle; Rec.MovieTitle)
                {
                    ApplicationArea = All;

                }

            }
        }
    }


}