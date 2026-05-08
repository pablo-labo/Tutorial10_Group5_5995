package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.media3.database.DatabaseIOException;
import defpackage.hw0;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes.dex */
public final class gu1 {
    public final HashMap<String, fu1> a = new HashMap<>();
    public final SparseArray<String> b = new SparseArray<>();
    public final SparseBooleanArray c = new SparseBooleanArray();
    public final SparseBooleanArray d = new SparseBooleanArray();
    public final c e;
    public c f;

    public static final class a implements c {
        public static final String[] e = {"id", "key", "metadata"};
        public final sf3 a;
        public final SparseArray<fu1> b = new SparseArray<>();
        public String c;
        public String d;

        public a(sf3 sf3Var) {
            this.a = sf3Var;
        }

        @Override // gu1.c
        public final void a(fu1 fu1Var) {
            this.b.put(fu1Var.a, fu1Var);
        }

        @Override // gu1.c
        public final void b(HashMap<String, fu1> map) throws DatabaseIOException {
            SparseArray<fu1> sparseArray = this.b;
            if (sparseArray.size() == 0) {
                return;
            }
            try {
                SQLiteDatabase writableDatabase = this.a.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                for (int i = 0; i < sparseArray.size(); i++) {
                    try {
                        fu1 fu1VarValueAt = sparseArray.valueAt(i);
                        if (fu1VarValueAt == null) {
                            int iKeyAt = sparseArray.keyAt(i);
                            String str = this.d;
                            str.getClass();
                            writableDatabase.delete(str, "id = ?", new String[]{Integer.toString(iKeyAt)});
                        } else {
                            g(writableDatabase, fu1VarValueAt);
                        }
                    } catch (Throwable th) {
                        writableDatabase.endTransaction();
                        throw th;
                    }
                }
                writableDatabase.setTransactionSuccessful();
                sparseArray.clear();
                writableDatabase.endTransaction();
            } catch (SQLException e2) {
                throw new DatabaseIOException(e2);
            }
        }

        @Override // gu1.c
        public final void c(long j) {
            String hexString = Long.toHexString(j);
            this.c = hexString;
            this.d = l5.l("ExoPlayerCacheIndex", hexString);
        }

        @Override // gu1.c
        public final void d(HashMap<String, fu1> map) throws DatabaseIOException {
            try {
                SQLiteDatabase writableDatabase = this.a.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    h(writableDatabase);
                    Iterator<fu1> it = map.values().iterator();
                    while (it.hasNext()) {
                        g(writableDatabase, it.next());
                    }
                    writableDatabase.setTransactionSuccessful();
                    this.b.clear();
                    writableDatabase.endTransaction();
                } catch (Throwable th) {
                    writableDatabase.endTransaction();
                    throw th;
                }
            } catch (SQLException e2) {
                throw new DatabaseIOException(e2);
            }
        }

        @Override // gu1.c
        public final void delete() throws DatabaseIOException {
            sf3 sf3Var = this.a;
            String str = this.c;
            str.getClass();
            try {
                String strConcat = "ExoPlayerCacheIndex".concat(str);
                SQLiteDatabase writableDatabase = sf3Var.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    int i = dng.a;
                    try {
                        String str2 = vjg.a;
                        if (DatabaseUtils.queryNumEntries(writableDatabase, "sqlite_master", "tbl_name = ?", new String[]{"ExoPlayerVersions"}) > 0) {
                            writableDatabase.delete("ExoPlayerVersions", "feature = ? AND instance_uid = ?", new String[]{Integer.toString(1), str});
                        }
                        writableDatabase.execSQL("DROP TABLE IF EXISTS ".concat(strConcat));
                        writableDatabase.setTransactionSuccessful();
                    } catch (SQLException e2) {
                        throw new DatabaseIOException(e2);
                    }
                } finally {
                    writableDatabase.endTransaction();
                }
            } catch (SQLException e3) {
                throw new DatabaseIOException(e3);
            }
        }

        @Override // gu1.c
        public final void e(fu1 fu1Var, boolean z) {
            int i = fu1Var.a;
            SparseArray<fu1> sparseArray = this.b;
            if (z) {
                sparseArray.delete(i);
            } else {
                sparseArray.put(i, null);
            }
        }

        @Override // gu1.c
        public final boolean exists() throws DatabaseIOException {
            try {
                SQLiteDatabase readableDatabase = this.a.getReadableDatabase();
                String str = this.c;
                str.getClass();
                return dng.a(readableDatabase, 1, str) != -1;
            } catch (SQLException e2) {
                throw new DatabaseIOException(e2);
            }
        }

        @Override // gu1.c
        public final void f(HashMap<String, fu1> map, SparseArray<String> sparseArray) throws DatabaseIOException {
            sf3 sf3Var = this.a;
            ka2.q(this.b.size() == 0);
            try {
                SQLiteDatabase readableDatabase = sf3Var.getReadableDatabase();
                String str = this.c;
                str.getClass();
                if (dng.a(readableDatabase, 1, str) != 1) {
                    SQLiteDatabase writableDatabase = sf3Var.getWritableDatabase();
                    writableDatabase.beginTransactionNonExclusive();
                    try {
                        h(writableDatabase);
                        writableDatabase.setTransactionSuccessful();
                        writableDatabase.endTransaction();
                    } catch (Throwable th) {
                        writableDatabase.endTransaction();
                        throw th;
                    }
                }
                SQLiteDatabase readableDatabase2 = sf3Var.getReadableDatabase();
                String str2 = this.d;
                str2.getClass();
                Cursor cursorQuery = readableDatabase2.query(str2, e, null, null, null, null, null);
                while (cursorQuery.moveToNext()) {
                    try {
                        int i = cursorQuery.getInt(0);
                        String string = cursorQuery.getString(1);
                        string.getClass();
                        map.put(string, new fu1(i, string, gu1.a(new DataInputStream(new ByteArrayInputStream(cursorQuery.getBlob(2))))));
                        sparseArray.put(i, string);
                    } finally {
                    }
                }
                cursorQuery.close();
            } catch (SQLiteException e2) {
                map.clear();
                sparseArray.clear();
                throw new DatabaseIOException(e2);
            }
        }

        public final void g(SQLiteDatabase sQLiteDatabase, fu1 fu1Var) throws IOException {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            gu1.b(fu1Var.e, new DataOutputStream(byteArrayOutputStream));
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", Integer.valueOf(fu1Var.a));
            contentValues.put("key", fu1Var.b);
            contentValues.put("metadata", byteArray);
            String str = this.d;
            str.getClass();
            sQLiteDatabase.replaceOrThrow(str, null, contentValues);
        }

        public final void h(SQLiteDatabase sQLiteDatabase) {
            String str = this.c;
            str.getClass();
            dng.b(sQLiteDatabase, 1, str);
            String str2 = this.d;
            str2.getClass();
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ".concat(str2));
            sQLiteDatabase.execSQL("CREATE TABLE " + this.d + " (id INTEGER PRIMARY KEY NOT NULL,key TEXT NOT NULL,metadata BLOB NOT NULL)");
        }
    }

    public static class b implements c {
        public final Cipher a = null;
        public final SecretKeySpec b = null;
        public final hw0 c;
        public boolean d;
        public lad e;

        public b(File file) {
            this.c = new hw0(file);
        }

        public static int g(fu1 fu1Var, int i) {
            int iHashCode = fu1Var.b.hashCode() + (fu1Var.a * 31);
            nm3 nm3Var = fu1Var.e;
            if (i < 2) {
                long jA = at2.a(nm3Var);
                return (iHashCode * 31) + ((int) (jA ^ (jA >>> 32)));
            }
            return nm3Var.hashCode() + (iHashCode * 31);
        }

        public static fu1 h(int i, DataInputStream dataInputStream) throws IOException {
            nm3 nm3VarA;
            int i2 = dataInputStream.readInt();
            String utf = dataInputStream.readUTF();
            if (i < 2) {
                long j = dataInputStream.readLong();
                bt2 bt2Var = new bt2();
                bt2Var.a(Long.valueOf(j), "exo_len");
                nm3VarA = nm3.c.b(bt2Var);
            } else {
                nm3VarA = gu1.a(dataInputStream);
            }
            return new fu1(i2, utf, nm3VarA);
        }

        @Override // gu1.c
        public final void a(fu1 fu1Var) {
            this.d = true;
        }

        @Override // gu1.c
        public final void b(HashMap<String, fu1> map) throws Throwable {
            if (this.d) {
                d(map);
            }
        }

        @Override // gu1.c
        public final void c(long j) {
        }

        @Override // gu1.c
        public final void d(HashMap<String, fu1> map) throws Throwable {
            hw0 hw0Var = this.c;
            DataOutputStream dataOutputStream = null;
            try {
                hw0.a aVarA = hw0Var.a();
                lad ladVar = this.e;
                if (ladVar == null) {
                    this.e = new lad(aVarA);
                } else {
                    ladVar.a(aVarA);
                }
                DataOutputStream dataOutputStream2 = new DataOutputStream(this.e);
                try {
                    dataOutputStream2.writeInt(2);
                    dataOutputStream2.writeInt(0);
                    dataOutputStream2.writeInt(map.size());
                    int iG = 0;
                    for (fu1 fu1Var : map.values()) {
                        dataOutputStream2.writeInt(fu1Var.a);
                        dataOutputStream2.writeUTF(fu1Var.b);
                        gu1.b(fu1Var.e, dataOutputStream2);
                        iG += g(fu1Var, 2);
                    }
                    dataOutputStream2.writeInt(iG);
                    dataOutputStream2.close();
                    hw0Var.b.delete();
                    String str = vjg.a;
                    this.d = false;
                } catch (Throwable th) {
                    th = th;
                    dataOutputStream = dataOutputStream2;
                    vjg.g(dataOutputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }

        @Override // gu1.c
        public final void delete() {
            hw0 hw0Var = this.c;
            hw0Var.a.delete();
            hw0Var.b.delete();
        }

        @Override // gu1.c
        public final void e(fu1 fu1Var, boolean z) {
            this.d = true;
        }

        @Override // gu1.c
        public final boolean exists() {
            hw0 hw0Var = this.c;
            return hw0Var.a.exists() || hw0Var.b.exists();
        }

        @Override // gu1.c
        public final void f(HashMap<String, fu1> map, SparseArray<String> sparseArray) throws Throwable {
            DataInputStream dataInputStream;
            ka2.q(!this.d);
            hw0 hw0Var = this.c;
            File file = hw0Var.a;
            File file2 = hw0Var.a;
            File file3 = hw0Var.b;
            if (file.exists() || file3.exists()) {
                DataInputStream dataInputStream2 = null;
                try {
                    if (file3.exists()) {
                        file2.delete();
                        file3.renameTo(file2);
                    }
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file2));
                    DataInputStream dataInputStream3 = new DataInputStream(bufferedInputStream);
                    try {
                        int i = dataInputStream3.readInt();
                        if (i < 0 || i > 2) {
                            vjg.g(dataInputStream3);
                        } else {
                            if ((dataInputStream3.readInt() & 1) != 0) {
                                Cipher cipher = this.a;
                                if (cipher != null) {
                                    byte[] bArr = new byte[16];
                                    dataInputStream3.readFully(bArr);
                                    IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr);
                                    try {
                                        SecretKeySpec secretKeySpec = this.b;
                                        String str = vjg.a;
                                        cipher.init(2, secretKeySpec, ivParameterSpec);
                                        dataInputStream = new DataInputStream(new CipherInputStream(bufferedInputStream, cipher));
                                    } catch (InvalidAlgorithmParameterException e) {
                                        e = e;
                                        throw new IllegalStateException(e);
                                    } catch (InvalidKeyException e2) {
                                        e = e2;
                                        throw new IllegalStateException(e);
                                    }
                                }
                                vjg.g(dataInputStream3);
                            } else {
                                dataInputStream = dataInputStream3;
                            }
                            try {
                                int i2 = dataInputStream.readInt();
                                int iG = 0;
                                for (int i3 = 0; i3 < i2; i3++) {
                                    fu1 fu1VarH = h(i, dataInputStream);
                                    String str2 = fu1VarH.b;
                                    map.put(str2, fu1VarH);
                                    sparseArray.put(fu1VarH.a, str2);
                                    iG += g(fu1VarH, i);
                                }
                                int i4 = dataInputStream.readInt();
                                boolean z = dataInputStream.read() == -1;
                                if (i4 == iG && z) {
                                    vjg.g(dataInputStream);
                                    return;
                                }
                                vjg.g(dataInputStream);
                            } catch (IOException unused) {
                                dataInputStream2 = dataInputStream;
                                if (dataInputStream2 != null) {
                                    vjg.g(dataInputStream2);
                                }
                            } catch (Throwable th) {
                                dataInputStream2 = dataInputStream;
                                th = th;
                                if (dataInputStream2 != null) {
                                    vjg.g(dataInputStream2);
                                }
                                throw th;
                            }
                        }
                    } catch (IOException unused2) {
                        dataInputStream2 = dataInputStream3;
                    } catch (Throwable th2) {
                        th = th2;
                        dataInputStream2 = dataInputStream3;
                    }
                } catch (IOException unused3) {
                } catch (Throwable th3) {
                    th = th3;
                }
                map.clear();
                sparseArray.clear();
                file2.delete();
                file3.delete();
            }
        }
    }

    public interface c {
        void a(fu1 fu1Var);

        void b(HashMap<String, fu1> map);

        void c(long j);

        void d(HashMap<String, fu1> map);

        void delete();

        void e(fu1 fu1Var, boolean z);

        boolean exists();

        void f(HashMap<String, fu1> map, SparseArray<String> sparseArray);
    }

    public gu1(sf3 sf3Var, File file) {
        a aVar = sf3Var != null ? new a(sf3Var) : null;
        b bVar = new b(new File(file, "cached_content_index.exi"));
        if (aVar != null) {
            this.e = aVar;
            this.f = bVar;
        } else {
            String str = vjg.a;
            this.e = bVar;
            this.f = aVar;
        }
    }

    public static nm3 a(DataInputStream dataInputStream) throws IOException {
        int i = dataInputStream.readInt();
        HashMap map = new HashMap();
        for (int i2 = 0; i2 < i; i2++) {
            String utf = dataInputStream.readUTF();
            int i3 = dataInputStream.readInt();
            if (i3 < 0) {
                r40.h(p6.c(i3, "Invalid value size: "));
                return null;
            }
            int iMin = Math.min(i3, 10485760);
            byte[] bArrCopyOf = vjg.b;
            int i4 = 0;
            while (i4 != i3) {
                int i5 = i4 + iMin;
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, i5);
                dataInputStream.readFully(bArrCopyOf, i4, iMin);
                iMin = Math.min(i3 - i5, 10485760);
                i4 = i5;
            }
            map.put(utf, bArrCopyOf);
        }
        return new nm3(map);
    }

    public static void b(nm3 nm3Var, DataOutputStream dataOutputStream) throws IOException {
        Set<Map.Entry<String, byte[]>> setEntrySet = nm3Var.b.entrySet();
        dataOutputStream.writeInt(setEntrySet.size());
        for (Map.Entry<String, byte[]> entry : setEntrySet) {
            dataOutputStream.writeUTF(entry.getKey());
            byte[] value = entry.getValue();
            dataOutputStream.writeInt(value.length);
            dataOutputStream.write(value);
        }
    }

    public final fu1 c(String str) {
        return this.a.get(str);
    }

    public final fu1 d(String str) {
        HashMap<String, fu1> map = this.a;
        fu1 fu1Var = map.get(str);
        if (fu1Var != null) {
            return fu1Var;
        }
        SparseArray<String> sparseArray = this.b;
        int size = sparseArray.size();
        int i = 0;
        int iKeyAt = size == 0 ? 0 : sparseArray.keyAt(size - 1) + 1;
        if (iKeyAt < 0) {
            while (i < size && i == sparseArray.keyAt(i)) {
                i++;
            }
            iKeyAt = i;
        }
        fu1 fu1Var2 = new fu1(iKeyAt, str, nm3.c);
        map.put(str, fu1Var2);
        sparseArray.put(iKeyAt, str);
        this.d.put(iKeyAt, true);
        this.e.a(fu1Var2);
        return fu1Var2;
    }

    public final void e(long j) {
        c cVar;
        c cVar2 = this.e;
        cVar2.c(j);
        c cVar3 = this.f;
        if (cVar3 != null) {
            cVar3.c(j);
        }
        boolean zExists = cVar2.exists();
        SparseArray<String> sparseArray = this.b;
        HashMap<String, fu1> map = this.a;
        if (zExists || (cVar = this.f) == null || !cVar.exists()) {
            cVar2.f(map, sparseArray);
        } else {
            this.f.f(map, sparseArray);
            cVar2.d(map);
        }
        c cVar4 = this.f;
        if (cVar4 != null) {
            cVar4.delete();
            this.f = null;
        }
    }

    public final void f(String str) {
        HashMap<String, fu1> map = this.a;
        fu1 fu1Var = map.get(str);
        if (fu1Var != null && fu1Var.c.isEmpty() && fu1Var.d.isEmpty()) {
            map.remove(str);
            int i = fu1Var.a;
            SparseBooleanArray sparseBooleanArray = this.d;
            boolean z = sparseBooleanArray.get(i);
            this.e.e(fu1Var, z);
            SparseArray<String> sparseArray = this.b;
            if (z) {
                sparseArray.remove(i);
                sparseBooleanArray.delete(i);
            } else {
                sparseArray.put(i, null);
                this.c.put(i, true);
            }
        }
    }

    public final void g() {
        this.e.b(this.a);
        SparseBooleanArray sparseBooleanArray = this.c;
        int size = sparseBooleanArray.size();
        for (int i = 0; i < size; i++) {
            this.b.remove(sparseBooleanArray.keyAt(i));
        }
        sparseBooleanArray.clear();
        this.d.clear();
    }
}
