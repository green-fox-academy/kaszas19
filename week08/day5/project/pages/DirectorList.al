page 50100 DirectorList
{
    PageType = List;
    ApplicationArea = All;
    UsageCategory = Administration;
    SourceTable = Director;
    CardPageId = DirectorCard;
    Caption = 'List of Directors';
    Editable = false;

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