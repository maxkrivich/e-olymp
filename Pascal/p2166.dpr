program p2166;
{$APPTYPE CONSOLE}
uses SysUtils;

procedure Sort(var str: String);
var
  i, j, k: Integer;
  s: char;
begin
  for i := Low(str) to High(str) - 1 do
  begin
    k := i;
    for j := i + 1 to High(str) do
      if (str[j] < str[k]) then
        k := j;
    s := str[i];
    str[i] := str[k];
    str[k] := s;
  end;
end;

var
  p: Integer;
  t: boolean;
  s1, s2: String;

begin
  Readln(s1);
  Readln(s2);
  p := 1;
  t := True;
  Sort(s1);
  Sort(s2);
  if not (Length(s1) = Length(s2)) then
    t := false;
  while (p <= High(s1)) and (t) do
    if s1[p] = s2[p] then
      Inc(p)
    else
      t := false;
  if t then
    Writeln('YES')
  else
    Writeln('NO');
end.
