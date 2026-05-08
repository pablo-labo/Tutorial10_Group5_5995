package com.facebook.soloader;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Process;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import dalvik.system.BaseDexClassLoader;
import defpackage.d84;
import defpackage.ja;
import defpackage.l6;
import defpackage.r40;
import defpackage.x95;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes2.dex */
public final class SysUtil {

    @d84
    @TargetApi(21)
    public static final class LollipopSysdeps {
        private LollipopSysdeps() {
        }

        @d84
        public static void fallocateIfSupported(FileDescriptor fileDescriptor, long j) throws IOException {
            int i;
            try {
                Os.posix_fallocate(fileDescriptor, 0L, j);
            } catch (ErrnoException e) {
                if (e.errno != OsConstants.EOPNOTSUPP && (i = e.errno) != OsConstants.ENOSYS && i != OsConstants.EINVAL) {
                    throw new IOException(e.toString(), e);
                }
            }
        }

        @d84
        public static String[] getSupportedAbis() {
            String[] strArr = Build.SUPPORTED_ABIS;
            TreeSet treeSet = new TreeSet();
            try {
                if (is64Bit()) {
                    treeSet.add("arm64-v8a");
                    treeSet.add("x86_64");
                } else {
                    treeSet.add("armeabi-v7a");
                    treeSet.add("x86");
                }
                ArrayList arrayList = new ArrayList();
                for (String str : strArr) {
                    if (treeSet.contains(str)) {
                        arrayList.add(str);
                    }
                }
                return (String[]) arrayList.toArray(new String[arrayList.size()]);
            } catch (ErrnoException e) {
                Log.e("SysUtil", String.format("Could not read /proc/self/exe. Falling back to default ABI list: %s. errno: %d Err msg: %s", Arrays.toString(strArr), Integer.valueOf(e.errno), e.getMessage()));
                return Build.SUPPORTED_ABIS;
            }
        }

        @d84
        public static boolean is64Bit() {
            return Os.readlink("/proc/self/exe").contains("64");
        }
    }

    @d84
    @TargetApi(23)
    public static final class MarshmallowSysdeps {
        private MarshmallowSysdeps() {
        }

        @d84
        public static String[] getSupportedAbis() {
            String[] strArr = Build.SUPPORTED_ABIS;
            TreeSet treeSet = new TreeSet();
            if (is64Bit()) {
                treeSet.add("arm64-v8a");
                treeSet.add("x86_64");
            } else {
                treeSet.add("armeabi-v7a");
                treeSet.add("x86");
            }
            ArrayList arrayList = new ArrayList();
            for (String str : strArr) {
                if (treeSet.contains(str)) {
                    arrayList.add(str);
                }
            }
            return (String[]) arrayList.toArray(new String[arrayList.size()]);
        }

        @d84
        public static boolean is64Bit() {
            return Process.is64Bit();
        }
    }

    public static void a(File file) throws IOException {
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.canWrite() && !parentFile.setWritable(true)) {
            Log.e("SysUtil", "Enable write permission failed: " + parentFile);
        }
        if (file.delete() || !file.exists()) {
            return;
        }
        r40.h(l6.g(file, "Could not delete file "));
    }

    public static void b(File file) throws IOException {
        Stack stack = new Stack();
        stack.push(file);
        ArrayList arrayList = new ArrayList();
        while (!stack.isEmpty()) {
            File file2 = (File) stack.pop();
            if (file2.isDirectory()) {
                arrayList.add(file2);
                File[] fileArrListFiles = file2.listFiles();
                if (fileArrListFiles != null) {
                    for (File file3 : fileArrListFiles) {
                        stack.push(file3);
                    }
                }
            } else {
                a(file2);
            }
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            a((File) arrayList.get(size));
        }
    }

    public static void c(File file) throws IOException {
        Stack stack = new Stack();
        stack.push(file);
        while (!stack.isEmpty()) {
            File file2 = (File) stack.pop();
            if (file2.isDirectory()) {
                File[] fileArrListFiles = file2.listFiles();
                if (fileArrListFiles == null) {
                    r40.h(l6.g(file2, "cannot list directory "));
                    return;
                }
                for (File file3 : fileArrListFiles) {
                    stack.push(file3);
                }
            } else if (file2.getPath().endsWith("_lock")) {
                continue;
            } else {
                try {
                    RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "r");
                    try {
                        randomAccessFile.getFD().sync();
                        randomAccessFile.close();
                    } catch (Throwable th) {
                        try {
                            randomAccessFile.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (IOException e) {
                    Log.e("SysUtil", "Syncing failed for " + file2 + ": " + e.getMessage());
                }
            }
        }
    }

    public static x95 d(File file, File file2) throws Throwable {
        boolean z;
        try {
            return new x95(file2);
        } catch (FileNotFoundException e) {
            z = true;
            try {
                if (!file.setWritable(true)) {
                    throw e;
                }
                x95 x95Var = new x95(file2);
                if (!file.setWritable(false)) {
                    Log.w("SysUtil", "error removing " + file.getCanonicalPath() + " write permission");
                }
                return x95Var;
            } catch (Throwable th) {
                th = th;
                if (z && !file.setWritable(false)) {
                    Log.w("SysUtil", "error removing " + file.getCanonicalPath() + " write permission");
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            z = false;
            if (z) {
                Log.w("SysUtil", "error removing " + file.getCanonicalPath() + " write permission");
            }
            throw th;
        }
    }

    @d84
    public static String getClassLoaderLdLoadLibrary() {
        ClassLoader classLoader = SoLoader.class.getClassLoader();
        if (classLoader != null && !(classLoader instanceof BaseDexClassLoader)) {
            ja.q("ClassLoader ", classLoader.getClass().getName(), " should be of type BaseDexClassLoader");
            return null;
        }
        try {
            return (String) BaseDexClassLoader.class.getMethod("getLdLibraryPath", null).invoke((BaseDexClassLoader) classLoader, null);
        } catch (Exception e) {
            Log.e("SysUtil", "Cannot call getLdLibraryPath", e);
            return null;
        }
    }

    @d84
    public static Method getNativeLoadRuntimeMethod() {
        if (Build.VERSION.SDK_INT > 27) {
            return null;
        }
        try {
            Method declaredMethod = Runtime.class.getDeclaredMethod("nativeLoad", String.class, ClassLoader.class, String.class);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Exception e) {
            Log.w("SysUtil", "Cannot get nativeLoad method", e);
            return null;
        }
    }
}
