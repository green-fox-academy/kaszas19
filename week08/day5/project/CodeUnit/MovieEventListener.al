codeunit 50102 MovieEventList
{
    [EventSubscriber(ObjectType::Table, DataBase::Movie, 'OnAfterInsertEvent', '', true, true)]
    local procedure MyProcedure(var Rec: Record Movie)
    begin
        if Rec.DirectorId <> 0 then begin
            ShowMovieDirectAndNumberOfMovies(Rec.DirectorId);
        end else begin
            ShowLongestMovieTitleAndLength();
        end;
    end;

    local procedure ShowMovieDirectAndNumberOfMovies(DirectorId: Integer)
    var
        DirectorRecord: Record Director;
    begin
        DirectorRecord.Get(DirectorId);
        DirectorRecord.CalcFields(TotalMovies);
        Message('Name: %1, Number of directed movies: %2', DirectorRecord.Name, DirectorRecord.TotalMovies);
    end;

    local procedure ShowLongestMovieTitleAndLength()
    var
        MovieRecord: Record Movie;
        MaxLength: Integer;
        Title: Text;
    begin
        if MovieRecord.FindFirst() then begin
            MaxLength := MovieRecord.LengthInMinute;
            Title := MovieRecord.Title;
            while MovieRecord.Next <> 0 do begin
                if MovieRecord.LengthInMinute > MaxLength then begin
                    MaxLength := MovieRecord.LengthInMinute;
                    Title := MovieRecord.Title;
                end;
            end;
            Message('The title of the longes movie: %1, length: %2', Title, MaxLength);
        end;
    end;

}