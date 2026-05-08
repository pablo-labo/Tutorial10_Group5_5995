package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class q8b {
    public File a;
    public final pf5 b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        public static final a e;
        public static final /* synthetic */ a[] f;

        static {
            a aVar = new a("ATTEMPT_MIGRATION", 0);
            a = aVar;
            a aVar2 = new a("NOT_GENERATED", 1);
            b = aVar2;
            a aVar3 = new a("UNREGISTERED", 2);
            c = aVar3;
            a aVar4 = new a("REGISTERED", 3);
            d = aVar4;
            a aVar5 = new a("REGISTER_ERROR", 4);
            e = aVar5;
            f = new a[]{aVar, aVar2, aVar3, aVar4, aVar5};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f.clone();
        }
    }

    public q8b(pf5 pf5Var) {
        this.b = pf5Var;
    }

    public final File a() {
        if (this.a == null) {
            synchronized (this) {
                try {
                    if (this.a == null) {
                        pf5 pf5Var = this.b;
                        pf5Var.a();
                        this.a = new File(pf5Var.a.getFilesDir(), "PersistedInstallation." + this.b.d() + ".json");
                    }
                } finally {
                }
            }
        }
        return this.a;
    }

    public final void b(k31 k31Var) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", k31Var.b);
            jSONObject.put("Status", k31Var.c.ordinal());
            jSONObject.put("AuthToken", k31Var.d);
            jSONObject.put("RefreshToken", k31Var.e);
            jSONObject.put("TokenCreationEpochInSecs", k31Var.g);
            jSONObject.put("ExpiresInSecs", k31Var.f);
            jSONObject.put("FisError", k31Var.h);
            pf5 pf5Var = this.b;
            pf5Var.a();
            File fileCreateTempFile = File.createTempFile("PersistedInstallation", "tmp", pf5Var.a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (fileCreateTempFile.renameTo(a())) {
            } else {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    public final k31 c() {
        JSONObject jSONObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(a());
            while (true) {
                try {
                    int i = fileInputStream.read(bArr, 0, 16384);
                    if (i < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i);
                } finally {
                }
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        }
        String strOptString = jSONObject.optString("Fid", null);
        int iOptInt = jSONObject.optInt("Status", 0);
        String strOptString2 = jSONObject.optString("AuthToken", null);
        String strOptString3 = jSONObject.optString("RefreshToken", null);
        long jOptLong = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
        long jOptLong2 = jSONObject.optLong("ExpiresInSecs", 0L);
        String strOptString4 = jSONObject.optString("FisError", null);
        int i2 = r8b.a;
        a aVar = a.values()[iOptInt];
        if (aVar != null) {
            return new k31(strOptString, aVar, strOptString2, strOptString3, jOptLong2, jOptLong, strOptString4);
        }
        ja.k("Null registrationStatus");
        return null;
    }
}
