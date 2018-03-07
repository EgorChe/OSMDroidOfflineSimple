# OSMDroidOfflineSimple

Пример использования оффлайн карт и [osmdroid](https://github.com/osmdroid/osmdroid).

## Подготовка плиток карты (map tiles)
1. Для этого надо скачать [Mobile Atlas Creator](http://mobac.sourceforge.net/).
2. После запуска Mobile Atlas Creator, выбираем в списке Osmdroid ZIP
3. Выбираем в поле Map Source - OpenStreetMap HikebikeMap.de
4. Выставляем Zoom Level от 7 до 17. 
5. Выделяем область (в примере был выделен город Челябинск). 
6. В поле Atlas Content нажимаем на кнопку Add selection.
7. По умолчанию в поле Layer settings: custom tile processing: должно быть установлено Tile format - PNG. Проверьте это.
8. Нажимаем на кнопку Create Atlas.

Карты готовы и сохранены в формате ZIP.

![Скриншот](https://github.com/EgorChe/OSMDroidOfflineSimple/raw/master/image/image.png)



## Добавление карт на мобильное устройство

Добавьте карты в формате ZIP на мобильноt устройство в папку:
```
/mnt/sdcard/osmdroid/tiles.zip
```

Для запуска проекта можно скачать уже готовый [ZIP файл](http://www.dropwizard.io/1.0.2/docs/).
