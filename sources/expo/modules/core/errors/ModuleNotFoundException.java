package expo.modules.core.errors;

import defpackage.l5;

/* JADX INFO: loaded from: classes3.dex */
public class ModuleNotFoundException extends CodedException {
    public ModuleNotFoundException(String str) {
        super(l5.m("Module '", str, "' not found. Are you sure all modules are linked correctly?"));
    }

    @Override // expo.modules.core.errors.CodedException
    public final String a() {
        return "E_MODULE_NOT_FOUND";
    }
}
