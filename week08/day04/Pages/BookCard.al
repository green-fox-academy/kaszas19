page 50100 BookCard
{
    PageType = Card;
    ApplicationArea = All;
    UsageCategory = Administration;
    DelayedInsert = true;
    SourceTable = Book;
    AutoSplitKey = true;

    layout
    {
        area(Content)
        {
            group(General)
            {


                field(Title; Rec.Title)
                {
                    ApplicationArea = All;

                }

                field(Author; Rec.Author)
                {
                    ApplicationArea = All;

                }

                field(HardCover; Rec.HardCover)
                {
                    ApplicationArea = All;

                }

                field(PageCount; Rec.PageCount)
                {
                    ApplicationArea = All;

                }

            }
        }
    }

}