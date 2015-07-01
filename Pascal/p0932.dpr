program p932;
{$APPTYPE CONSOLE}
uses
  SysUtils;
var
  s, a, h, d: real;
begin
  read(s);
  read(a);
  d := a * a + 8 * s;
  h := (-a + sqrt(d)) / 2;
  writeln(h: 0: 2);
end.
 
