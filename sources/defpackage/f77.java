package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class f77 extends xs9 {
    @Override // defpackage.xs9
    public final void a(sze szeVar) {
        szeVar.D("CREATE TABLE IF NOT EXISTS `DeletedRecentSearch` (`uid` TEXT NOT NULL, `accountId` TEXT NOT NULL, `whatQuery` TEXT NOT NULL, `whereQuery` TEXT NOT NULL, `searchTimestamp` INTEGER NOT NULL, `createdAt` INTEGER NOT NULL, PRIMARY KEY(`uid`))");
        szeVar.D("CREATE UNIQUE INDEX IF NOT EXISTS `index_DeletedRecentSearch_accountId_whatQuery_whereQuery` ON `DeletedRecentSearch` (`accountId`, `whatQuery`, `whereQuery`)");
    }
}
