query 50100 Top10DomesticSales
{
    QueryType = Normal;
    OrderBy = descending(DomesticSales);

    elements
    {
        dataitem(BoxOffice; BoxOffice)
        {
            column(DomesticSales; DomesticSales)
            {

            }

            column(MovieId; MovieId)
            {

            }

        }
    }


    trigger OnBeforeOpen()
    begin
        TopNumberOfRows(10);
    end;
}