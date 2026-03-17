#!/usr/bin/env python3
"""Re-generate key static-analysis evidence for Assignment 1."""

from pathlib import Path
from androguard.misc import AnalyzeAPK

OUT = Path('deliverables/evidence')
OUT.mkdir(parents=True, exist_ok=True)

apk, ds, dx = AnalyzeAPK('a1_case1.apk')

(OUT / 'apk_metadata.txt').write_text('\n'.join([
    f'package: {apk.get_package()}',
    f'main_activity: {apk.get_main_activity()}',
    'activities:',
    *[f'- {a}' for a in apk.get_activities()],
]) + '\n')

keys = {
    ('Lcom/example/mastg_test0016/Login;', 'generateSessionToken'),
    ('Lcom/example/mastg_test0016/Login;', 'createSession'),
    ('Lcom/example/mastg_test0016/Login;', 'checkCredentials'),
    ('Lcom/example/mastg_test0016/Login$1;', 'onClick'),
    ('Lcom/example/mastg_test0016/Profile;', 'clearSession'),
}

for ma in dx.get_methods():
    m = ma.get_method()
    if not hasattr(m, 'get_code') or m.get_code() is None:
        continue
    if (m.get_class_name(), m.get_name()) in keys:
        name = f"{m.get_class_name().strip('L;').replace('/', '_')}__{m.get_name()}.java.txt"
        (OUT / name).write_text(f"{m.get_class_name()} {m.get_name()}{m.get_descriptor()}\n\n{m.get_source()}\n")

print('Evidence regenerated in', OUT)
