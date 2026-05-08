package com.facebook.soloader;

import com.facebook.soloader.g;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends g {

    public final class a extends g.d {
        public final b[] a;

        /* JADX WARN: Code restructure failed: missing block: B:29:0x00e9, code lost:
        
            throw new java.lang.RuntimeException("illegal line in exopackage metadata: [" + r11 + "]");
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public a(com.facebook.soloader.c r18, com.facebook.soloader.c r19) throws java.io.IOException {
            /*
                Method dump skipped, instruction units count: 295
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.c.a.<init>(com.facebook.soloader.c, com.facebook.soloader.c):void");
        }

        @Override // com.facebook.soloader.g.d
        public final g.b[] h() {
            return this.a;
        }

        @Override // com.facebook.soloader.g.d
        public final void p(File file) throws IOException {
            byte[] bArr = new byte[32768];
            for (b bVar : this.a) {
                FileInputStream fileInputStream = new FileInputStream(bVar.c);
                try {
                    g.c cVar = new g.c(bVar, fileInputStream);
                    fileInputStream = null;
                    try {
                        g.d.a(cVar, bArr, file);
                        cVar.close();
                    } finally {
                    }
                } catch (Throwable th) {
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                    throw th;
                }
            }
        }
    }

    public static final class b extends g.b {
        public final File c;

        public b(File file, String str, String str2) {
            super(str, str2);
            this.c = file;
        }
    }

    @Override // defpackage.p54, defpackage.ene
    public final String c() {
        return "ExoSoSource";
    }

    @Override // com.facebook.soloader.g
    public final g.d h() {
        return new a(this, this);
    }
}
