program p931;
{$APPTYPE CONSOLE}

uses
  SysUtils;

var
  n, sum, mul: Int64;
begin
  mul := 1;
  sum := 0;
  Readln(n);
  while (n <> 0) do
  begin
    sum := sum + (n mod 10);
    mul := mul * (n mod 10);
    n := n div 10;
  end;
  Writeln(mul / sum: 0: 3);
end.
