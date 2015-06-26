program p1;
{$APPTYPE CONSOLE}
uses
  SysUtils;

var
  a, b: integer;
begin
  read(a);
  writeln(a div 10, ' ', a mod 10);
end.

