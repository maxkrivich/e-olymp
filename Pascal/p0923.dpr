program p923;
{$APPTYPE CONSOLE}
uses SysUtils;
var
  n: 1..12;
begin
  read(n);
  case n of
    12, 1, 2: Writeln('Winter');
    9, 10, 11: Writeln('Autumn');
    3, 4, 5: Writeln('Spring');
    6, 7, 8: Writeln('Summer');
  end;
end.
 
