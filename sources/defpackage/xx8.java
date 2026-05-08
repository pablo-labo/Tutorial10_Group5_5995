package defpackage;

import defpackage.e69;
import defpackage.fe9;

/* JADX INFO: loaded from: classes3.dex */
public final class xx8 implements ee9<fe9.a> {

    public static final class a {
        public static int a(CharSequence charSequence, int i) {
            char cCharAt;
            char cCharAt2;
            while (i < charSequence.length() && ((cCharAt2 = charSequence.charAt(i)) == ' ' || cCharAt2 == '\t')) {
                i++;
            }
            if (i < charSequence.length() && charSequence.charAt(i) == '\n') {
                while (true) {
                    i++;
                    if (i >= charSequence.length() || ((cCharAt = charSequence.charAt(i)) != ' ' && cCharAt != '\t')) {
                        break;
                    }
                }
            }
            return i;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x018d A[PHI: r13
  0x018d: PHI (r13v9 char) = (r13v8 char), (r13v10 char), (r13v11 char) binds: [B:124:0x017f, B:127:0x0184, B:131:0x018b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005b A[EDGE_INSN: B:206:0x005b->B:23:0x005b BREAK  A[LOOP:1: B:19:0x004f->B:36:0x007c], EDGE_INSN: B:209:0x005b->B:23:0x005b BREAK  A[LOOP:1: B:19:0x004f->B:36:0x007c]] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c7 A[EDGE_INSN: B:230:0x00c7->B:54:0x00c7 BREAK  A[LOOP:5: B:58:0x00d5->B:80:0x010d], EDGE_INSN: B:231:0x00c7->B:54:0x00c7 BREAK  A[LOOP:5: B:58:0x00d5->B:80:0x010d], EDGE_INSN: B:232:0x00c7->B:54:0x00c7 BREAK  A[LOOP:5: B:58:0x00d5->B:80:0x010d], EDGE_INSN: B:233:0x00c7->B:54:0x00c7 BREAK  A[LOOP:5: B:58:0x00d5->B:80:0x010d], EDGE_INSN: B:236:0x00c7->B:54:0x00c7 BREAK  A[LOOP:5: B:58:0x00d5->B:80:0x010d]] */
    @Override // defpackage.ee9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<defpackage.ce9> a(e69.a r18, defpackage.xpb r19, fe9.a r20) {
        /*
            Method dump skipped, instruction units count: 658
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xx8.a(e69$a, xpb, fe9$a):java.util.List");
    }

    @Override // defpackage.ee9
    public final boolean b(e69.a aVar, gd9 gd9Var) {
        aVar.getClass();
        gd9Var.getClass();
        return false;
    }
}
