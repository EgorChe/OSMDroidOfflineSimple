# OSMDroidOfflineSimple

Пример использования оффлайн карт и [osmdroid](https://github.com/osmdroid/osmdroid) на Java и Kotlin.

## Подготовка плиток карты (map tiles)
1. Для этого надо скачать [Mobile Atlas Creator](http://mobac.sourceforge.net/).
2. После запуска Mobile Atlas Creator, выбираем в списке Osmdroid ZIP
3. Выбираем в поле Map Source - OpenStreetMap HikebikeMap.de
4. Выставляем Zoom Level от 7 до 17. 
5. Выделяем нужную область (в примере выделен город Челябинск). 
6. В поле Atlas Content нажимаем на кнопку Add selection.
7. По умолчанию в поле Layer settings: custom tile processing: должно быть установлено Tile format - PNG. Проверьте это.
8. Нажимаем на кнопку Create Atlas.

Карты готовы и сохранены в формате ZIP.

![Скриншот](https://github.com/EgorChe/OSMDroidOfflineSimple/blob/master/image/image.PNG)

## Добавление карт на мобильное устройство

Добавьте карты в формате ZIP на мобильноt устройство в папку:
```
/mnt/sdcard/osmdroid/tiles.zip
```

Для запуска проекта можно скачать уже готовый [ZIP файл](http://www.dropwizard.io/1.0.2/docs/).

## Незабудьте добавить в проект 
### В Android Manifest
```
    <uses-permission android:name="android.permission.ACCESS_FINE_LOCATION"/>
    <uses-permission android:name="android.permission.WRITE_EXTERNAL_STORAGE" />
```
### В build.gradle
```
    compile 'org.osmdroid:osmdroid-android:6.0.1'
```

## Важный момент
Чтобы узнать aName из конструктора:
```
mapView.setTileSource(new XYTileSource(final String aName, final int aZoomMinLevel,
			final int aZoomMaxLevel, final int aTileSizePixels, final String aImageFilenameEnding,
			final String[] aBaseUrl)
```
Надо в открыть ZIP файл название первой папки и будет aName.
