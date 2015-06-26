program p902;
{$APPTYPE CONSOLE}
uses SysUtils;
var
  n: 1..12;
begin
  read(n);
  case n of
    1, 2, 3: writeln('Initial');
    4, 5, 6: writeln('Average');
    7, 8, 9: writeln('Sufficient');
    10, 11, 12: writeln('High');
  end;
end.
