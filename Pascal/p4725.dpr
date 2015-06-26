program p4725;
{$APPTYPE CONSOLE}
uses SysUtils;

var
  i, n: integer;
  sum: int64;
begin
  sum := 0;
  readln(n);
  for i := 1 to n do
    sum := sum + i * i;
  writeln(sum);
end.
