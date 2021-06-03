codeunit 50103 BoxOfficeEventListener
{
    [EventSubscriber(ObjectType::Table, Database::BoxOffice, 'OnAfterInsertEvent', '', true, true)]
    local procedure MyProcedure(var Rec: Record BoxOffice)
    var
        DirectorRecord: Record Director;
        InternationalPosition: Integer;
        DomesticPosition: Integer;
    begin
        Rec.CalcFields(DirectorId);
        Rec.CalcFields(MovieTitle);
        DirectorRecord.Get(Rec.DirectorId);
        InternationalPosition := ShowPositionInInternationalSalesRanking(Rec.MovieId);
        DomesticPosition := ShowPositionInDomesticSalesRanking(Rec.MovieId);
        Message('Movie Title: %1, Director: %2, International sales: %3, Domestic sales: %4', Rec.MovieTitle, DirectorRecord.Name, InternationalPosition, DomesticPosition);
    end;

    local procedure ShowPositionInInternationalSalesRanking(MovieId: Integer) Position: Integer
    var
        TopInterQuery: Query Top10InternationalSales;
    begin
        if TopInterQuery.Open() then begin
            while TopInterQuery.Read() do begin
                Position += 1;
                if TopInterQuery.MovieId = MovieId then begin
                    exit;
                end;
            end;
        end;
    end;

    local procedure ShowPositionInDomesticSalesRanking(MovieId: Integer) Position: Integer
    var
        TopInterQuery: Query Top10DomesticSales;
    begin
        if TopInterQuery.Open() then begin
            while TopInterQuery.Read() do begin
                Position += 1;
                if TopInterQuery.MovieId = MovieId then begin
                    exit;
                end;
            end;
        end;
    end;

}