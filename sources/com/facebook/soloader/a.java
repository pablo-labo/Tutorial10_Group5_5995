package com.facebook.soloader;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Parcel;
import android.os.StrictMode;
import android.util.Log;
import com.facebook.soloader.d;
import com.facebook.soloader.d.b;
import com.facebook.soloader.g;
import defpackage.akb;
import defpackage.ene;
import defpackage.l5;
import defpackage.mtc;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends g implements mtc {
    public final ArrayList<d> e;
    public boolean f;

    /* JADX INFO: renamed from: com.facebook.soloader.a$a, reason: collision with other inner class name */
    public class C0145a extends g.d {
        public C0145a() {
        }

        @Override // com.facebook.soloader.g.d
        public final g.b[] h() throws IOException {
            ArrayList arrayList = new ArrayList();
            for (d dVar : a.this.e) {
                dVar.getClass();
                d.b bVar = dVar.new b(dVar);
                try {
                    d.a[] aVarArrS = bVar.a;
                    if (aVarArrS == null) {
                        aVarArrS = bVar.s();
                        bVar.a = aVarArrS;
                    }
                    arrayList.addAll(Arrays.asList(aVarArrS));
                    bVar.close();
                } catch (Throwable th) {
                    try {
                        bVar.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            return (g.b[]) arrayList.toArray(new g.b[arrayList.size()]);
        }

        @Override // com.facebook.soloader.g.d
        public final void p(File file) throws IOException {
            for (d dVar : a.this.e) {
                dVar.getClass();
                d.b bVar = dVar.new b(dVar);
                try {
                    bVar.p(file);
                    bVar.close();
                } catch (Throwable th) {
                    try {
                        bVar.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        }
    }

    public a(Context context, String str, boolean z) {
        super(context, str, z);
        ArrayList<d> arrayList = new ArrayList<>();
        this.e = arrayList;
        this.f = false;
        arrayList.add(new d(context, str, new File(context.getApplicationInfo().sourceDir)));
        if (context.getApplicationInfo().splitSourceDirs == null) {
            return;
        }
        try {
            for (String str2 : context.getApplicationInfo().splitSourceDirs) {
                d dVar = new d(context, str, new File(str2));
                d.b bVar = dVar.new b(dVar);
                try {
                    boolean z2 = bVar.s().length != 0;
                    bVar.close();
                    if (z2) {
                        Log.w("BackupSoSource", "adding backup source from split: " + dVar.toString());
                        this.e.add(dVar);
                    }
                } catch (Throwable th) {
                    try {
                        bVar.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        } catch (IOException e) {
            Log.w("BackupSoSource", "failed to read split apks", e);
        }
    }

    @Override // defpackage.mtc
    public final ene b(Context context) {
        a aVar = new a(context, this.a.getName(), true);
        try {
            aVar.e(0);
            return aVar;
        } catch (IOException e) {
            l5.r(e);
            return null;
        }
    }

    @Override // defpackage.p54, defpackage.ene
    public final String c() {
        return "BackupSoSource";
    }

    @Override // defpackage.p54, defpackage.ene
    public final int d(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        if (this.f) {
            return super.d(str, i, threadPolicy);
        }
        return 0;
    }

    @Override // com.facebook.soloader.g, defpackage.ene
    public final void e(int i) {
        if ((i & 8) != 0) {
            return;
        }
        super.e(i);
        this.f = true;
    }

    @Override // com.facebook.soloader.g
    public final byte[] f() {
        ArrayList<d> arrayList = this.e;
        Context context = this.d;
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeByte((byte) 3);
            PackageManager packageManager = context.getPackageManager();
            int i = 0;
            if (packageManager != null) {
                try {
                    i = packageManager.getPackageInfo(context.getPackageName(), 0).versionCode;
                } catch (PackageManager.NameNotFoundException | RuntimeException unused) {
                }
            }
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(arrayList.size());
            Iterator<d> it = arrayList.iterator();
            while (it.hasNext()) {
                parcelObtain.writeByteArray(it.next().f());
            }
            String str = context.getApplicationInfo().sourceDir;
            if (str == null) {
                parcelObtain.writeByte((byte) 1);
                byte[] bArrMarshall = parcelObtain.marshall();
                parcelObtain.recycle();
                return bArrMarshall;
            }
            File canonicalFile = new File(str).getCanonicalFile();
            if (!canonicalFile.exists()) {
                parcelObtain.writeByte((byte) 1);
                byte[] bArrMarshall2 = parcelObtain.marshall();
                parcelObtain.recycle();
                return bArrMarshall2;
            }
            parcelObtain.writeByte((byte) 2);
            parcelObtain.writeString(canonicalFile.getPath());
            parcelObtain.writeLong(canonicalFile.lastModified());
            byte[] bArrMarshall3 = parcelObtain.marshall();
            parcelObtain.recycle();
            return bArrMarshall3;
        } catch (Throwable th) {
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // com.facebook.soloader.g
    public final g.b[] g() throws IOException {
        d dVar = this.e.get(0);
        dVar.getClass();
        d.b bVar = dVar.new b(dVar);
        try {
            d.a[] aVarArrS = bVar.a;
            if (aVarArrS == null) {
                aVarArrS = bVar.s();
                bVar.a = aVarArrS;
            }
            bVar.close();
            return aVarArrS;
        } catch (Throwable th) {
            try {
                bVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // com.facebook.soloader.g
    public final g.d h() {
        return new C0145a();
    }

    public final boolean k(String str) throws IOException {
        for (g.b bVar : new C0145a().h()) {
            if (bVar.a.equals(str)) {
                Log.e("SoLoader", "Found " + str + " in BackupSoSource");
                Log.e("SoLoader", "Preparing BackupSoSource");
                e(0);
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.p54, defpackage.ene
    public final String toString() {
        String name;
        File file = this.a;
        try {
            name = String.valueOf(file.getCanonicalPath());
        } catch (IOException unused) {
            name = file.getName();
        }
        StringBuilder sbM = akb.m("BackupSoSource[root = ", name, " flags = ");
        sbM.append(this.b);
        sbM.append(" apks = ");
        sbM.append(this.e.toString());
        sbM.append("]");
        return sbM.toString();
    }
}
