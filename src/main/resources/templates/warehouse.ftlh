<!DOCTYPE html>
<html lang="ru">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Детали склада</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            background-color: #f8f9fa;
        }
        .breadcrumb-item a {
            text-decoration: none;
        }
        .table th, .table td {
            vertical-align: middle;
        }
        .btn-primary {
            background-color: #ff8c00;
            border: none;
        }
        .btn-primary:hover {
            background-color: #e67e00;
        }
    </style>
</head>
<body>
<div class="container py-5">
    <!-- Навигация "Хлебные крошки" -->
    <nav aria-label="breadcrumb">
        <ol class="breadcrumb">
            <li class="breadcrumb-item"><a href="#">Здания</a></li>
            <li class="breadcrumb-item"><a href="#">Комнаты</a></li>
            <li class="breadcrumb-item"><a href="#">Секции</a></li>
            <li class="breadcrumb-item active" aria-current="page">Склад</li>
        </ol>
    </nav>

    <!-- Заголовок склада -->
    <div class="d-flex justify-content-between align-items-center mb-4">
        <h1 class="h3">Склад: ${warehouse.name}</h1>
        <button class="btn btn-primary"><a href="/warehouse/add">Отправить в другой склад</a></button>
    </div>

    <!-- Информация о складе -->
    <div class="mb-4 p-3 bg-white rounded shadow-sm">
        <h5>Информация о складе</h5>
        <ul class="list-unstyled mb-0">
            <li><strong>Расположение:</strong> ${warehouse.area.room.name}, ${warehouse.area.name}</li>
            <li><strong>ТЦ:</strong> ${warehouse.moll.fullName}</li>
        </ul>
    </div>

    <!-- Таблица инвентаря -->
    <div class="bg-white rounded shadow-sm p-3">
        <h5>Инвентарь</h5>
        <table class="table table-hover mt-3">
            <thead class="table-light">
            <tr>
                <th>#</th>
                <th>Номенклатура</th>
                <th>Единица измерения</th>
                <th>Количество</th>
                <th>Действия</th>
            </tr>
            </thead>
            <tbody>
            <#list stocks as stock>
                <tr>
                    <td>${stock.id}</td>
                    <td>${stock.nomenclature.name}</td>
                    <td>${stock.unitType.name}</td>
                    <td>${stock.quantity}</td>
                    <td>
                        <button class="btn btn-sm btn-primary">Переместить</button>
                        <button class="btn btn-sm btn-danger">Расходавано</button>
                    </td>
                </tr>
            </#list>
            <#--            <tr>-->
            <#--                <td>1</td>-->
            <#--                <td>Хлорид натрия</td>-->
            <#--                <td>кг</td>-->
            <#--                <td>5,000</td>-->
            <#--                <td>-->
            <#--                    <button class="btn btn-sm btn-primary">Переместить</button>-->
            <#--                    <button class="btn btn-sm btn-danger">Удалить</button>-->
            <#--                </td>-->
            <#--            </tr>-->
            <#--            <tr>-->
            <#--                <td>2</td>-->
            <#--                <td>Хлорид калия</td>-->
            <#--                <td>кг</td>-->
            <#--                <td>3,000</td>-->
            <#--                <td>-->
            <#--                    <button class="btn btn-sm btn-primary">Переместить</button>-->
            <#--                    <button class="btn btn-sm btn-danger">Удалить</button>-->
            <#--                </td>-->
            <#--            </tr>-->
            </tbody>
        </table>
    </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>