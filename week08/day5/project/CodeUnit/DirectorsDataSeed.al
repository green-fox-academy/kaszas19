codeunit 50100 DirectorDataSeed
{

    Subtype = Install;

    trigger OnInstallAppPerCompany();
    var
        DirectorRecord: Record Director;
    begin
        if DirectorRecord.IsEmpty then begin
            InsertDirector(1, 'Lucas', 18850812D);
            InsertDirector(2, 'Stephen Hawking', 19850512D);
            InsertDirector(3, 'J. J. Abrams', 19960627D);
            InsertDirector(4, 'Woody Allen', 19351201D);
            InsertDirector(5, 'Robert Altman', 19250220D);
        end;
    end;


    local procedure InsertDirector(Id: Integer; Name: Text[120]; Birth: Date)
    var
        DirectorRecord: Record Director;
    begin
        DirectorRecord.Id := Id;
        DirectorRecord.Name := Name;
        DirectorRecord.Birth := Birth;
        DirectorRecord.Insert();
    end;
}