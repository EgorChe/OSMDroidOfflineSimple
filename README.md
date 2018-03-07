# OSMDroidOfflineSimple

Пример использования оффлайн карт и osmdroid.

Подготовка плиток карты (map tiles)
1. Для этого надо скачать Mobile Atlas Creator.
2. После запуска Mobile Atlas Creator, выбираем в списке Osmdroid ZIP
3. Выбираем в поле Map Source - OpenStreetMap HikebikeMap.de
4. Выставляем Zoom Level от 7 до 17. 
5. Выделяем область (в примере был выделен город Челябинск). 
6. В поле Atlas Content нажимаем на кнопку Add selection.
7. По умолчанию в поле Layer settings: custom tile processing: должно быть установлено Tile format - PNG. Проверьте это.
8. Нажимаем на кнопку Create Atlas.

Карты готовы и сохранены в формате ZIP.

Добавьте карты в формате ZIP в папку на мобильном устройстве:
/mnt/sdcard/osmdroid/tiles.zip

Для запуска проекта можно скачать уже готовый ZIP файл.


