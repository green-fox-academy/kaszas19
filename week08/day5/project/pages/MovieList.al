page 50102 MovieList
{
    PageType = List;
    ApplicationArea = All;
    UsageCategory = Administration;
    SourceTable = Movie;
    CardPageId = MovieCard;
    Caption = 'List of Movie';

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
                    Caption = 'Title of the Movie';
                }

                field(Year; Rec.Year)
                {
                    ApplicationArea = All;
                    Caption = 'Releasd Year';
                }

                field(LengthInMinute; Rec.LengthInMinute)
                {
                    ApplicationArea = All;
                    Caption = 'Movie lengt in minutes';
                }

                field(DirectorId; Rec.DirectorId)
                {
                    ApplicationArea = All;
                    Caption = 'Director Id';
                }

                field(DirectorName; Rec.DirectorName)
                {
                    ApplicationArea = All;
                    Caption = 'Director Name';
                }

            }
        }
    }

}