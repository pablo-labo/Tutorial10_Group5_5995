package com.rivereactnative;

import defpackage.wv4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class f {
    public static final a a;
    public static final /* synthetic */ f[] b;
    public static final /* synthetic */ wv4 c;
    private final String mValue;

    public static final class a {
    }

    static {
        f[] fVarArr = {new f("Number", 0, "number"), new f("String", 1, "string"), new f("Boolean", 2, "boolean"), new f("Color", 3, "color"), new f("Trigger", 4, "trigger"), new f("Enum", 5, "enum")};
        b = fVarArr;
        c = new wv4(fVarArr);
        a = new a();
    }

    public f(String str, int i, String str2) {
        this.mValue = str2;
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) b.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.mValue;
    }
}
