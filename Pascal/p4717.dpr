program p4717;
{$APPTYPE CONSOLE}
uses SysUtils;

var
  n, k: integer;
begin
  readln(n, k);
  n := k mod n;
  writeln(round(n));
end.
