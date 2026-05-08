package defpackage;

import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.io.AccessDeniedException;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class xa5 implements r6e<File> {
    public final File a;
    public final eb5 b;
    public final Function2<File, IOException, j6g> c;

    public static abstract class a extends c {
    }

    public final class b extends o2<File> {
        public final ArrayDeque<c> c;

        public final class a extends a {
            public boolean b;
            public File[] c;
            public int d;
            public boolean e;
            public final /* synthetic */ b f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b bVar, File file) {
                super(file);
                file.getClass();
                this.f = bVar;
            }

            @Override // xa5.c
            public final File a() {
                boolean z = this.e;
                File file = this.a;
                if (!z && this.c == null) {
                    File[] fileArrListFiles = file.listFiles();
                    this.c = fileArrListFiles;
                    if (fileArrListFiles == null) {
                        Function2<File, IOException, j6g> function2 = xa5.this.c;
                        if (function2 != null) {
                            function2.invoke(file, new AccessDeniedException(file));
                        }
                        this.e = true;
                    }
                }
                File[] fileArr = this.c;
                if (fileArr == null || this.d >= fileArr.length) {
                    if (this.b) {
                        return null;
                    }
                    this.b = true;
                    return file;
                }
                fileArr.getClass();
                int i = this.d;
                this.d = i + 1;
                return fileArr[i];
            }
        }

        /* JADX INFO: renamed from: xa5$b$b, reason: collision with other inner class name */
        public final class C0476b extends c {
            public boolean b;

            @Override // xa5.c
            public final File a() {
                if (this.b) {
                    return null;
                }
                this.b = true;
                return this.a;
            }
        }

        public final class c extends a {
            public boolean b;
            public File[] c;
            public int d;
            public final /* synthetic */ b e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(b bVar, File file) {
                super(file);
                file.getClass();
                this.e = bVar;
            }

            @Override // xa5.c
            public final File a() {
                Function2<File, IOException, j6g> function2;
                boolean z = this.b;
                File file = this.a;
                if (!z) {
                    this.b = true;
                    return file;
                }
                File[] fileArr = this.c;
                if (fileArr != null && this.d >= fileArr.length) {
                    return null;
                }
                if (fileArr == null) {
                    File[] fileArrListFiles = file.listFiles();
                    this.c = fileArrListFiles;
                    if (fileArrListFiles == null && (function2 = xa5.this.c) != null) {
                        function2.invoke(file, new AccessDeniedException(file));
                    }
                    File[] fileArr2 = this.c;
                    if (fileArr2 == null || fileArr2.length == 0) {
                        return null;
                    }
                }
                File[] fileArr3 = this.c;
                fileArr3.getClass();
                int i = this.d;
                this.d = i + 1;
                return fileArr3[i];
            }
        }

        public b() {
            ArrayDeque<c> arrayDeque = new ArrayDeque<>();
            this.c = arrayDeque;
            File file = xa5.this.a;
            if (file.isDirectory()) {
                arrayDeque.push(b(file));
            } else if (!file.isFile()) {
                this.a = 2;
            } else {
                file.getClass();
                arrayDeque.push(new C0476b(file));
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.o2
        public final void a() {
            T t;
            File fileA;
            while (true) {
                ArrayDeque<c> arrayDeque = this.c;
                c cVarPeek = arrayDeque.peek();
                if (cVarPeek == null) {
                    t = 0;
                    break;
                }
                fileA = cVarPeek.a();
                if (fileA == null) {
                    arrayDeque.pop();
                } else if (fileA.equals(cVarPeek.a) || !fileA.isDirectory() || arrayDeque.size() >= Integer.MAX_VALUE) {
                    break;
                } else {
                    arrayDeque.push(b(fileA));
                }
            }
            t = fileA;
            if (t == 0) {
                this.a = 2;
            } else {
                this.b = t;
                this.a = 1;
            }
        }

        public final a b(File file) {
            int iOrdinal = xa5.this.b.ordinal();
            if (iOrdinal == 0) {
                return new c(this, file);
            }
            if (iOrdinal == 1) {
                return new a(this, file);
            }
            l.g();
            return null;
        }
    }

    public static abstract class c {
        public final File a;

        public c(File file) {
            file.getClass();
            this.a = file;
        }

        public abstract File a();
    }

    public xa5(File file, eb5 eb5Var, kotlin.io.a aVar) {
        this.a = file;
        this.b = eb5Var;
        this.c = aVar;
    }

    @Override // defpackage.r6e
    public final Iterator<File> iterator() {
        return new b();
    }
}
