program p918;
{$APPTYPE CONSOLE}
uses SysUtils;

var
  x, y: real;
begin
  read(x, y);
  if (x = 0) or (y = 0) then
    Writeln(0)
  else
  begin
    if x > 0 then
      if y > 0 then
        Writeln('1')
      else
        Writeln('4')
    else if y > 0 then
      writeln('2')
    else
      Writeln('3');
  end;
end.

