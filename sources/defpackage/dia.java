package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class dia {
    public static final dia V;
    public static final dia W;
    public static final /* synthetic */ dia[] X;
    public static final dia a;
    public static final dia b;
    public static final dia c;
    public static final dia d;
    public static final dia e;
    public static final dia f;

    /* JADX INFO: Fake field, exist only in values array */
    dia EF1;

    static {
        dia diaVar = new dia("FROM_IDE", 0);
        dia diaVar2 = new dia("FROM_BACKEND", 1);
        dia diaVar3 = new dia("FROM_TEST", 2);
        dia diaVar4 = new dia("FROM_BUILTINS", 3);
        a = diaVar4;
        dia diaVar5 = new dia("WHEN_CHECK_DECLARATION_CONFLICTS", 4);
        dia diaVar6 = new dia("WHEN_CHECK_OVERRIDES", 5);
        dia diaVar7 = new dia("FOR_SCRIPT", 6);
        dia diaVar8 = new dia("FROM_REFLECTION", 7);
        b = diaVar8;
        dia diaVar9 = new dia("WHEN_RESOLVE_DECLARATION", 8);
        dia diaVar10 = new dia("WHEN_GET_DECLARATION_SCOPE", 9);
        dia diaVar11 = new dia("WHEN_RESOLVING_DEFAULT_TYPE_ARGUMENTS", 10);
        dia diaVar12 = new dia("FOR_ALREADY_TRACKED", 11);
        c = diaVar12;
        dia diaVar13 = new dia("WHEN_GET_ALL_DESCRIPTORS", 12);
        d = diaVar13;
        dia diaVar14 = new dia("WHEN_TYPING", 13);
        dia diaVar15 = new dia("WHEN_GET_SUPER_MEMBERS", 14);
        e = diaVar15;
        dia diaVar16 = new dia("FOR_NON_TRACKED_SCOPE", 15);
        f = diaVar16;
        dia diaVar17 = new dia("FROM_SYNTHETIC_SCOPE", 16);
        dia diaVar18 = new dia("FROM_DESERIALIZATION", 17);
        V = diaVar18;
        dia diaVar19 = new dia("FROM_JAVA_LOADER", 18);
        W = diaVar19;
        X = new dia[]{diaVar, diaVar2, diaVar3, diaVar4, diaVar5, diaVar6, diaVar7, diaVar8, diaVar9, diaVar10, diaVar11, diaVar12, diaVar13, diaVar14, diaVar15, diaVar16, diaVar17, diaVar18, diaVar19, new dia("WHEN_GET_LOCAL_VARIABLE", 19), new dia("WHEN_FIND_BY_FQNAME", 20), new dia("WHEN_GET_COMPANION_OBJECT", 21), new dia("FOR_DEFAULT_IMPORTS", 22)};
    }

    public dia() {
        throw null;
    }

    public static dia valueOf(String str) {
        return (dia) Enum.valueOf(dia.class, str);
    }

    public static dia[] values() {
        return (dia[]) X.clone();
    }
}
