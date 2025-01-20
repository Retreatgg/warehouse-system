<!DOCTYPE html>
<html lang="ru">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Накладная</title>
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
        .btn-secondary {
            border: none;
        }
    </style>
</head>
<body>
<div class="container py-5">
    <!-- Навигация -->
    <nav aria-label="breadcrumb">
        <ol class="breadcrumb">
            <li class="breadcrumb-item"><a href="#">История операций</a></li>
            <li class="breadcrumb-item active" aria-current="page">Накладная</li>
        </ol>
    </nav>

    <!-- Шапка страницы -->
    <div class="d-flex justify-content-between align-items-center mb-4">
        <h1 class="h3">Накладная №12345</h1>
        <div>
            <button class="btn btn-secondary me-2">Скачать</button>
            <button class="btn btn-primary">Печать</button>
        </div>
    </div>

    <!-- Основная информация -->
    <div class="mb-4 p-3 bg-white rounded shadow-sm">
        <h5>Основная информация</h5>
        <ul class="list-unstyled mb-0">
            <li><strong>Дата:</strong> 2025-01-15</li>
            <li><strong>Тип накладной:</strong> Приходная</li>
            <li><strong>Отправитель:</strong> Поставщик А</li>
            <li><strong>Получатель:</strong> Склад 1</li>
        </ul>
    </div>

    <!-- Таблица товаров -->
    <div class="bg-white rounded shadow-sm p-3 mb-4">
        <h5>Товары</h5>
        <table class="table table-hover mt-3">
            <thead class="table-light">
            <tr>
                <th>#</th>
                <th>Наименование</th>
                <th>Количество</th>
                <th>Единица</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td>1</td>
                <td>Сахар</td>
                <td>1,000</td>
                <td>кг</td>
            </tr>
            <tr>
                <td>2</td>
                <td>Пшеница</td>
                <td>500</td>
                <td>кг</td>
            </tr>
            </tbody>
            <tfoot>
<#--            <tr>-->
<#--                <th colspan="5" class="text-end">Итого:</th>-->
<#--                <th>65,000</th>-->
<#--            </tr>-->
            </tfoot>
        </table>
    </div>

    <!-- Подписи -->
    <div class="bg-white rounded shadow-sm p-3">
        <h5>Подписи</h5>
        <div class="row">
            <div class="col-md-6 text-center">
                <p><strong>Отправитель:</strong></p>
                <p>_____________________</p>
            </div>
            <div class="col-md-6 text-center">
                <p><strong>Получатель:</strong></p>
                <p>_____________________</p>
            </div>
        </div>
    </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>