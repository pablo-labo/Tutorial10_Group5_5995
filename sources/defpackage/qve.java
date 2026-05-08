package defpackage;

import java.security.PrivilegedAction;

/* JADX INFO: loaded from: classes3.dex */
public final class qve {
    public static final /* synthetic */ int a = 0;

    public static class a implements PrivilegedAction<String> {
        @Override // java.security.PrivilegedAction
        public final String run() {
            return System.getProperty("line.separator");
        }
    }

    static {
        try {
            try {
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            String.format("%n", new Object[0]);
        }
    }

    public static String a(String str) {
        char[] charArray = str.toCharArray();
        boolean z = false;
        for (int i = 0; i != charArray.length; i++) {
            char c = charArray[i];
            if ('A' <= c && 'Z' >= c) {
                charArray[i] = (char) (c + ' ');
                z = true;
            }
        }
        return z ? new String(charArray) : str;
    }
}
