page 50101 CalculationCard
{
    PageType = Card;
    ApplicationArea = All;
    UsageCategory = Administration;
    SourceTable = Calculation;
    DelayedInsert = true;
    AutoSplitKey = true;

    layout
    {
        area(Content)
        {
            group(GroupName)
            {


                field(FirstNumber; Rec.FirstNumber)
                {
                    ApplicationArea = All;

                }

                field(SecondNumber; Rec.SecondNumber)
                {
                    ApplicationArea = All;

                }


                field(Operators; Rec.Operators)
                {
                    ApplicationArea = All;

                }


            }

        }
    }


}