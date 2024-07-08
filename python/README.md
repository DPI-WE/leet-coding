# Python
You can run [Python unit tests](https://docs.python.org/3/library/unittest.html) with the command `python3 -m unittest discover tests`. It will run all of your tests in the `tests/` folder and output.

```bash
% python3 -m unittest discover tests
..
----------------------------------------------------------------------
Ran 2 tests in 0.000s

OK
```

You can also run a single test suite like this: `python -m unittest tests/test_sum.py`

## Debugging

Python comes with a built-in debugger called [pdb](https://docs.python.org/3/library/pdb.html). Simply add `breakpoint()` anywhere in your code and it will create a breakpoint at that line.

```python
# sum.py
def sum(a, b):
  breakpoint()
  return a + b
```

Now when you run the tests, it will pause execution at your breakpoint. 
```bash
% python3 -m unittest tests/test_sum.py
> sum.py(3)sum()
-> return a + b
(Pdb) 
```

Some [helpful commands](https://docs.python.org/3/library/pdb.html#debugger-commands):
- [(a)rgs](https://docs.python.org/3/library/pdb.html#pdbcommand-args)
- [(h)elp](https://docs.python.org/3/library/pdb.html#pdbcommand-help)
- [n(ext)](https://docs.python.org/3/library/pdb.html#pdbcommand-next)
- [c(ont(inue))](https://docs.python.org/3/library/pdb.html#pdbcommand-continue)
- [p](https://docs.python.org/3/library/pdb.html#pdbcommand-p)
- [l(ist)](https://docs.python.org/3/library/pdb.html#pdbcommand-list)
