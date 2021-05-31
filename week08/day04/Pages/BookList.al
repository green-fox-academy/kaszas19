page 50101 BookList
{
    PageType = List;
    ApplicationArea = All;
    UsageCategory = Administration;
    SourceTable = Book;
    CardPageId = BookCard;

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