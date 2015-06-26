program p928;
{$APPTYPE CONSOLE}

uses
  SysUtils;

var
  arr: array[1..100] of Integer;
  size, i, max, min: Integer;
begin
  Readln(size);
  for i := 1 to size do
    Read(arr[i]);
  max := arr[1];
  min := arr[1];
  for i := 1 to size do
  begin
    if max < arr[i] then
      max := arr[i];
    if min > arr[i] then
      min := arr[i];
  end;
  Writeln(max + min);
end.
