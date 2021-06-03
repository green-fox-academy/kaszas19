query 50101 Top10InternationalSales
{
    QueryType = Normal;
    OrderBy = descending(InternationalSales);

    elements
    {
        dataitem(BoxOffice; BoxOffice)
        {
            column(InternationalSales; InternationalSales)
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