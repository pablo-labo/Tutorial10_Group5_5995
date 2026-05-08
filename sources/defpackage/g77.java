package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class g77 extends xs9 {
    @Override // defpackage.xs9
    public final void a(sze szeVar) {
        szeVar.D("CREATE TABLE IF NOT EXISTS `HamburgerMenuItem` (`id` TEXT NOT NULL, `destinationUrl` TEXT NOT NULL, `label` TEXT NOT NULL, `subtitle` TEXT, PRIMARY KEY(`id`))");
        szeVar.D("CREATE TABLE IF NOT EXISTS `NavBarLeftItem` (`id` TEXT NOT NULL, `destinationUrl` TEXT NOT NULL, `label` TEXT NOT NULL, `logoUrl` TEXT, PRIMARY KEY(`id`))");
        szeVar.D("CREATE TABLE IF NOT EXISTS `NavBarRightItem` (`id` TEXT NOT NULL, `destinationUrl` TEXT NOT NULL, `label` TEXT NOT NULL, PRIMARY KEY(`id`))");
        szeVar.D("CREATE TABLE IF NOT EXISTS `CountrySiteItem` (`countryCode` TEXT NOT NULL, `countryName` TEXT NOT NULL, `baseUrl` TEXT NOT NULL, `supportedLanguageCodes` TEXT NOT NULL, `supportedLanguages` TEXT NOT NULL, PRIMARY KEY(`countryCode`))");
    }
}
