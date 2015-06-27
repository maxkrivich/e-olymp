program p407;
{$APPTYPE CONSOLE}
uses SysUtils;

procedure Swap(var str: string; a, b: integer);
var
  tmp: char;
begin
  tmp := str[a];
  str[a] := str[b];
  str[b] := tmp;
end;

var
  s: string;
  n, m, i, j: Integer;
begin
  Readln(m);
  s := 'GCV';
  for j := 1 to m do
  begin
    Readln (n);
    for i := 1 to n do
    begin
      Swap(s, 2, 3);
      Swap(s, 1, 2);
    end;
    Writeln(s);
    s := 'GCV';
  end;
end.
