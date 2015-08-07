program p3874;
{$APPTYPE CONSOLE}

uses SysUtils;

var n: Integer;

begin
  Readln(n);
  if Odd(n) then
    Writeln('Love')
  else
    Writeln('Not love');
end.
