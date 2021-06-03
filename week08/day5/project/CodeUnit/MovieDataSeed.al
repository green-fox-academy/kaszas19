codeunit 50101 MovieDateSeed
{

    Subtype = Install;

    trigger OnInstallAppPerCompany()
    var
        MovieRecord: Record Movie;
    begin
        if MovieRecord.IsEmpty then begin
            InsertMovie(1, 'Star Trek', 2015, 120, 3);
            InsertMovie(2, ' Kairó bíbor rózsája', 2003, 60, 4);
            InsertMovie(3, 'Halal Soron', 2002, 80, 2);
            InsertMovie(4, 'Gosford Park', 2001, 120, 5);
            InsertMovie(5, 'Star Wars', 2006, 90, 1);
        end;
    end;

    local procedure InsertMovie(Id: Integer; Title: Text[100]; Year: Integer; LengthInMinute: Decimal; DirectorId: Integer)
    var
        MovieRecord: Record Movie;
    begin
        MovieRecord.Id := Id;
        MovieRecord.Title := Title;
        MovieRecord.Year := Year;
        MovieRecord.LengthInMinute := LengthInMinute;
        MovieRecord.DirectorId := DirectorId;
        MovieRecord.Insert();
    end;

}