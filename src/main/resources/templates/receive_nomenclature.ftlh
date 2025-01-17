<!DOCTYPE html>
<html lang="ru">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Приём товаров</title>
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
        .form-control:focus {
            box-shadow: none;
            border-color: #ff8c00;
        }
    </style>
</head>
<body>
<div class="container py-5">
    <!-- Навигация -->
    <nav aria-label="breadcrumb">
        <ol class="breadcrumb">
            <li class="breadcrumb-item"><a href="#">Склады</a></li>
            <li class="breadcrumb-item active" aria-current="page">Отправка товаров</li>
        </ol>
    </nav>

    <!-- Шапка страницы -->
    <div class="d-flex justify-content-between align-items-center mb-4">
        <h1 class="h3">Отправка товаров</h1>
        <button class="btn btn-primary">Отправить</button>
    </div>

    <!-- Выбор поставщика -->
    <div class="mb-4 p-3 bg-white rounded shadow-sm">
        <h5>Информация о складе</h5>
        <select class="form-select mt-2">
            <option selected>Выберите склад</option>
            <option value="1">Поставщик A</option>
            <option value="2">Поставщик B</option>
            <option value="3">Поставщик C</option>
        </select>
    </div>

    <!-- Добавление товаров -->
    <div class="mb-4 p-3 bg-white rounded shadow-sm">
        <h5>Добавить товары</h5>
        <form class="row g-3 mt-2">
            <div class="col-md-6">
                <select class="form-select">
                    <option selected>Выберите товар</option>
                    <option value="1">Соль</option>
                    <option value="2">Сахар</option>
                    <option value="3">Пшеница</option>
                </select>
            </div>
            <div class="col-md-3">
                <input type="number" class="form-control" placeholder="Количество">
            </div>
            <div class="col-md-3">
                <select class="form-select">
                    <option selected>Единица измерения</option>
                    <option value="kg">кг</option>
                    <option value="ton">тонна</option>
                    <option value="litre">литр</option>
                </select>
            </div>
            <div class="col-12 text-end">
                <button type="button" class="btn btn-primary">Добавить товар</button>
            </div>
        </form>
    </div>

    <!-- Список добавленных товаров -->
    <div class="bg-white rounded shadow-sm p-3">
        <h5>Список товаров</h5>
        <table class="table table-hover mt-3">
            <thead class="table-light">
            <tr>
                <th>#</th>
                <th>Наименование</th>
                <th>Количество</th>
                <th>Единица</th>
                <th>Действия</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td>1</td>
                <td>Сахар</td>
                <td>1,000</td>
                <td>кг</td>
                <td>
                    <button class="btn btn-sm btn-danger">Удалить</button>
                </td>
            </tr>
            <tr>
                <td>2</td>
                <td>Пшеница</td>
                <td>500</td>
                <td>кг</td>
                <td>
                    <button class="btn btn-sm btn-danger">Удалить</button>
                </td>
            </tr>
            </tbody>
        </table>
    </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>