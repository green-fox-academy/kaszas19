page 50100 CalculationList
{
    PageType = Card;
    ApplicationArea = All;
    UsageCategory = Administration;
    SourceTable = Calculation;
    CardPageId = CalculationCard;


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
                field(FirstNumber; Rec.FirstNumber)
                {
                    ApplicationArea = All;

                }

                field(SecondNumber; Rec.SecondNumber)
                {
                    ApplicationArea = All;

                }

                field(Result; Rec.Result)
                {
                    ApplicationArea = All;

                }

            }
        }
    }


}