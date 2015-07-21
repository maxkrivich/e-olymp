program p1955;
{$APPTYPE CONSOLE}

uses SysUtils;

var
  d1, d2, m1, m2, y1, y2: Integer;

begin
  read(d1, m1, y1);
  read(d2, m2, y2);
  if ((m1 = m2) and (d2 < d1)) or (m2 < m1) then
    Inc(y1);
  Writeln(y2 - y1);
end.
